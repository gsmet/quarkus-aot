package fr.spacefox.perftests.quarkus.data.entity2;

import fr.spacefox.perftests.quarkus.core.port.data.Entity2DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service2.model.Model2;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity2Repository implements Entity2DatasourcePort, PanacheRepository<Entity2> {
    @Override
    public Optional<Model2> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
