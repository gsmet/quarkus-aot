package fr.spacefox.perftests.quarkus.data.entity97;

import fr.spacefox.perftests.quarkus.core.port.data.Entity97DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service97.model.Model97;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity97Repository implements Entity97DatasourcePort, PanacheRepository<Entity97> {
    @Override
    public Optional<Model97> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
