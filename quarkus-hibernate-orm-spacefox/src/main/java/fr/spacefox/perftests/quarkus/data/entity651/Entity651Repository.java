package fr.spacefox.perftests.quarkus.data.entity651;

import fr.spacefox.perftests.quarkus.core.port.data.Entity651DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service651.model.Model651;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity651Repository implements Entity651DatasourcePort, PanacheRepository<Entity651> {
    @Override
    public Optional<Model651> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
