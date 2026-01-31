package fr.spacefox.perftests.quarkus.data.entity748;

import fr.spacefox.perftests.quarkus.core.port.data.Entity748DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service748.model.Model748;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity748Repository implements Entity748DatasourcePort, PanacheRepository<Entity748> {
    @Override
    public Optional<Model748> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
