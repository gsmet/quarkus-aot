package fr.spacefox.perftests.quarkus.data.entity584;

import fr.spacefox.perftests.quarkus.core.port.data.Entity584DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service584.model.Model584;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity584Repository implements Entity584DatasourcePort, PanacheRepository<Entity584> {
    @Override
    public Optional<Model584> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
