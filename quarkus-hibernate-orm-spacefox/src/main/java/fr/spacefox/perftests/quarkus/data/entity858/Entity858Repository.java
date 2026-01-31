package fr.spacefox.perftests.quarkus.data.entity858;

import fr.spacefox.perftests.quarkus.core.port.data.Entity858DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service858.model.Model858;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity858Repository implements Entity858DatasourcePort, PanacheRepository<Entity858> {
    @Override
    public Optional<Model858> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
