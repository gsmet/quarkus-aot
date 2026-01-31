package fr.spacefox.perftests.quarkus.data.entity759;

import fr.spacefox.perftests.quarkus.core.port.data.Entity759DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service759.model.Model759;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity759Repository implements Entity759DatasourcePort, PanacheRepository<Entity759> {
    @Override
    public Optional<Model759> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
