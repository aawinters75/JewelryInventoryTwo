/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package week8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import week8.beans.Owner;
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> { }
