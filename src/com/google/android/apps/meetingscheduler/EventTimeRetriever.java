/*
 * Copyright (c) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.android.apps.meetingscheduler;

import java.util.List;

/**
 * Allows the retrieval of available meeting times.
 *
 * @since 2.2
 * @author Nicolas Garnier (nivco@google.com)
 */
public interface EventTimeRetriever {

  /**
   * Returns the list of available meeting times where all the given attendees
   * are free.
   *
   * @param attendees The list of attendees for which we want to find meeting
   *          times
   * @param settings The additional restrictions on the meeting times.
   * @return The list of available meeting times
   */
  public List<AvailableMeetingTime> getAvailableMeetingTime(List<Attendee> attendees,
      Settings settings);
}