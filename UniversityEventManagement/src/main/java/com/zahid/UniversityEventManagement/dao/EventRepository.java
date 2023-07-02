package com.zahid.UniversityEventManagement.dao;

import com.zahid.UniversityEventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
