/*
 * Sonar Mantis Plugin
 * Copyright (C) 2011 Jérémie Lagarde
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.mantis;

/**
 * @author Jeremie Lagarde
 * @since 0.3
 */
import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.RubyRailsWidget;

public class MantisDeveloperWidget extends AbstractRubyTemplate implements RubyRailsWidget {

  public String getId() {
    return "mantis_developers";
  }

  public String getTitle() {
    return "Mantis Developers";
  }

  @Override
  protected String getTemplatePath() {
    return "/org/sonar/plugins/mantis/mantisDevelopersWidget.erb";
  }
}
