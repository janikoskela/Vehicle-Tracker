/*
 * Copyright (C) 2015 janikoskela
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.urhola.vehicletracker;

import com.urhola.vehicletracker.connection.Connection;
import com.urhola.vehicletracker.exception.ConnectionException;
import com.urhola.vehicletracker.request.GetVehiclesRequest;
import com.urhola.vehicletracker.resource.vehicle.Vehicle;
import java.util.List;

/**
 *
 * @author janikoskela
 */
public class VehicleTracker {
    public static List<Vehicle> getVechiles(GetVehiclesRequest request) throws ConnectionException {
        Connection connection = Connection.getConnection(request);
        return connection.getVechiles(request);
    } 
}
