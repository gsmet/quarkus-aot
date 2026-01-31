package fr.spacefox.perftests.quarkus.data.entity303;

import fr.spacefox.perftests.quarkus.core.port.data.Entity303DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service303.model.Model303;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity303Repository implements Entity303DatasourcePort, PanacheRepository<Entity303> {
    @Override
    public Optional<Model303> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
