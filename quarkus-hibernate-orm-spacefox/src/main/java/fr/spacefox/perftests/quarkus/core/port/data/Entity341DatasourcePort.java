package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service341.model.Model341;
import java.util.Optional;

public interface Entity341DatasourcePort {
    Optional<Model341> find(Long id);
}
