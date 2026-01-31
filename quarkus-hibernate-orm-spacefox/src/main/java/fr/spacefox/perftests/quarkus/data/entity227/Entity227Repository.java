package fr.spacefox.perftests.quarkus.data.entity227;

import fr.spacefox.perftests.quarkus.core.port.data.Entity227DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service227.model.Model227;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity227Repository implements Entity227DatasourcePort, PanacheRepository<Entity227> {
    @Override
    public Optional<Model227> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
