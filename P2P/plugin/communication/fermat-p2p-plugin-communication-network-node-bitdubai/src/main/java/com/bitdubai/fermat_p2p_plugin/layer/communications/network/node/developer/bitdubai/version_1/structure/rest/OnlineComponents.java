/*
* @#AvailableComponents.java - 2016
* Copyright bitDubai.com., All rights reserved.
 * You may not modify, use, reproduce or distribute this software.
* BITDUBAI/CONFIDENTIAL
*/
package com.bitdubai.fermat_p2p_plugin.layer.communications.network.node.developer.bitdubai.version_1.structure.rest;

import com.bitdubai.fermat_p2p_api.layer.all_definition.common.network_services.template.exceptions.CantReadRecordDataBaseException;
import com.bitdubai.fermat_p2p_plugin.layer.communications.network.node.developer.bitdubai.version_1.structure.context.NodeContext;
import com.bitdubai.fermat_p2p_plugin.layer.communications.network.node.developer.bitdubai.version_1.structure.context.NodeContextItem;
import com.bitdubai.fermat_p2p_plugin.layer.communications.network.node.developer.bitdubai.version_1.structure.database.daos.DaoFactory;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.apache.commons.lang.ClassUtils;
import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * The Class <code>com.bitdubai.fermat_p2p_plugin.layer.communications.network.node.developer.bitdubai.version_1.structure.rest.OnlineComponents</code>
 * <p/>
 * Created by Roberto Requena - (rart3001@gmail.com) on 29/04/16.
 *
 * @version 1.0
 * @since Java JDK 1.7
 */
@Path("/online/component")
public class OnlineComponents implements RestFulServices {

    /**
     * Represent the LOG
     */
    private final Logger LOG = Logger.getLogger(ClassUtils.getShortClassName(OnlineComponents.class));

    /**
     * Represent the daoFactory
     */
    private DaoFactory daoFactory;

    /**
     * Represent the gson
     */
    private Gson gson;

    /**
     * Constructor
     */
    public OnlineComponents(){
        daoFactory = (DaoFactory) NodeContext.get(NodeContextItem.DAO_FACTORY);
        gson = new Gson();
    }

    @GET
    @Path("/ns/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isNsOnline(@PathParam("id") String identityPublicKey){

        LOG.info("Executing isOnlineNs");
        LOG.info("identityPublicKey = "+identityPublicKey);

        try {

            Boolean online = daoFactory.getCheckedInNetworkServiceDao().exists(identityPublicKey);

            LOG.info("Is online = " + online);

            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("success", Boolean.TRUE);
            jsonObject.addProperty("isOnline",online);

            return Response.status(200).entity(gson.toJson(jsonObject)).build();

        } catch (CantReadRecordDataBaseException e) {

            e.printStackTrace();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("success", Boolean.FALSE);
            jsonObject.addProperty("isOnline", Boolean.FALSE);
            jsonObject.addProperty("details", e.getMessage());

            return Response.status(200).entity(gson.toJson(jsonObject)).build();

        }

    }

    @GET
    @Path("/actor/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isActorOnline(@PathParam("id") String identityPublicKey){

        LOG.info("Executing isOnlineNs");
        LOG.info("identityPublicKey = "+identityPublicKey);

        try {

            Boolean online = daoFactory.getCheckedInNetworkServiceDao().exists(identityPublicKey);

            LOG.info("Is online = " + online);

            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("success", Boolean.TRUE);
            jsonObject.addProperty("isOnline",online);

            return Response.status(200).entity(gson.toJson(jsonObject)).build();

        } catch (CantReadRecordDataBaseException e) {

            e.printStackTrace();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("success", Boolean.FALSE);
            jsonObject.addProperty("isOnline", Boolean.FALSE);
            jsonObject.addProperty("details", e.getMessage());

            return Response.status(200).entity(gson.toJson(jsonObject)).build();

        }

    }

}
