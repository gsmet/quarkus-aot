package fr.spacefox.perftests.quarkus.data.entity498;

import fr.spacefox.perftests.quarkus.core.port.data.Entity498DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service498.model.Model498;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity498Repository implements Entity498DatasourcePort, PanacheRepository<Entity498> {
    @Override
    public Optional<Model498> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
