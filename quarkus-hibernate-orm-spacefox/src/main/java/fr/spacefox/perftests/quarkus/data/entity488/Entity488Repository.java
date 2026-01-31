package fr.spacefox.perftests.quarkus.data.entity488;

import fr.spacefox.perftests.quarkus.core.port.data.Entity488DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service488.model.Model488;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity488Repository implements Entity488DatasourcePort, PanacheRepository<Entity488> {
    @Override
    public Optional<Model488> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
