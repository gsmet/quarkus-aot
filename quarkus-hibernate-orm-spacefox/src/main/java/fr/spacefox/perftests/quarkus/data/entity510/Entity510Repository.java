package fr.spacefox.perftests.quarkus.data.entity510;

import fr.spacefox.perftests.quarkus.core.port.data.Entity510DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service510.model.Model510;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity510Repository implements Entity510DatasourcePort, PanacheRepository<Entity510> {
    @Override
    public Optional<Model510> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
