package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service584.model.Model584;
import java.util.Optional;

public interface Entity584DatasourcePort {
    Optional<Model584> find(Long id);
}
