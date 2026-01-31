package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service624.model.Model624;
import java.util.Optional;

public interface Entity624DatasourcePort {
    Optional<Model624> find(Long id);
}
