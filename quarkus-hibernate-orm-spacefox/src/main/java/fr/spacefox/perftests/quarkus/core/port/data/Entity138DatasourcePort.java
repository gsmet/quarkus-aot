package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service138.model.Model138;
import java.util.Optional;

public interface Entity138DatasourcePort {
    Optional<Model138> find(Long id);
}
