package fr.spacefox.perftests.quarkus.data.entity237;

import fr.spacefox.perftests.quarkus.core.port.data.Entity237DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service237.model.Model237;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity237Repository implements Entity237DatasourcePort, PanacheRepository<Entity237> {
    @Override
    public Optional<Model237> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
