/*
 * Copyright 2020 Prathab Murugan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.prathab.communityservice.services;

import com.prathab.communityservice.domain.Community;
import com.prathab.communityservice.domain.CommunityHouse;
import com.prathab.communityservice.dto.CommunityDto;
import java.util.Set;

public interface CommunityService {
  Community createCommunity(CommunityDto communityDto);

  Set<Community> listAll();

  Community getCommunityDetailsById(String communityId);

  Community addAdminsToCommunity(String communityId, Set<String> admins);

  String addHouseToCommunity(String communityId, CommunityHouse house);
}