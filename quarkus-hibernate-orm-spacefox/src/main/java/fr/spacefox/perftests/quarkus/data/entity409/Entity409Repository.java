package fr.spacefox.perftests.quarkus.data.entity409;

import fr.spacefox.perftests.quarkus.core.port.data.Entity409DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service409.model.Model409;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity409Repository implements Entity409DatasourcePort, PanacheRepository<Entity409> {
    @Override
    public Optional<Model409> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
