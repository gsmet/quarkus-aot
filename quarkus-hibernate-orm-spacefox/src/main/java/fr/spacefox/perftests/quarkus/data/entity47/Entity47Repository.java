package fr.spacefox.perftests.quarkus.data.entity47;

import fr.spacefox.perftests.quarkus.core.port.data.Entity47DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service47.model.Model47;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity47Repository implements Entity47DatasourcePort, PanacheRepository<Entity47> {
    @Override
    public Optional<Model47> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
