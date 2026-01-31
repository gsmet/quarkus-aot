package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service536.model.Model536;
import java.util.Optional;

public interface Entity536DatasourcePort {
    Optional<Model536> find(Long id);
}
