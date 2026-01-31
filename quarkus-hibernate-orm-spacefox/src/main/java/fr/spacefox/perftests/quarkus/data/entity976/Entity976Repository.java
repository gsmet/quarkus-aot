package fr.spacefox.perftests.quarkus.data.entity976;

import fr.spacefox.perftests.quarkus.core.port.data.Entity976DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service976.model.Model976;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity976Repository implements Entity976DatasourcePort, PanacheRepository<Entity976> {
    @Override
    public Optional<Model976> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
