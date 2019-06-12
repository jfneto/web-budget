/*
 * Copyright (C) 2019 Arthur Gregorio, AG.Software
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
package br.com.webbudget.domain.repositories.view;

import br.com.webbudget.domain.entities.registration.FinancialPeriod;
import br.com.webbudget.domain.entities.registration.MovementClassType;
import br.com.webbudget.domain.entities.view.UseByMovementClass;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;

/**
 * {@link UseByMovementClass} repository
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 3.0.0, 28/04/2019
 */
@Repository
public interface UseByMovementClassRepository extends EntityRepository<UseByMovementClass, Long> {

    /**
     * Find all {@link UseByMovementClass} filtering by {@link FinancialPeriod} and direction
     *
     * @param financialPeriodId to use as filter
     * @param direction to use as filter
     * @return a {@link List} of all {@link UseByMovementClass} found
     */
    List<UseByMovementClass> findByFinancialPeriodIdAndDirection(Long financialPeriodId, MovementClassType direction);
}
