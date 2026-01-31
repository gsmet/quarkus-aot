package fr.spacefox.perftests.quarkus.data.entity837;

import fr.spacefox.perftests.quarkus.core.port.data.Entity837DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service837.model.Model837;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity837Repository implements Entity837DatasourcePort, PanacheRepository<Entity837> {
    @Override
    public Optional<Model837> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
