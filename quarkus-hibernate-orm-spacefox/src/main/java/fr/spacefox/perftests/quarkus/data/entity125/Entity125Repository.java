package fr.spacefox.perftests.quarkus.data.entity125;

import fr.spacefox.perftests.quarkus.core.port.data.Entity125DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service125.model.Model125;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity125Repository implements Entity125DatasourcePort, PanacheRepository<Entity125> {
    @Override
    public Optional<Model125> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
