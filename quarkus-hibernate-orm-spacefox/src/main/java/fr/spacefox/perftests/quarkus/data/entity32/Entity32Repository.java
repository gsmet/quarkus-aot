package fr.spacefox.perftests.quarkus.data.entity32;

import fr.spacefox.perftests.quarkus.core.port.data.Entity32DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service32.model.Model32;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity32Repository implements Entity32DatasourcePort, PanacheRepository<Entity32> {
    @Override
    public Optional<Model32> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
