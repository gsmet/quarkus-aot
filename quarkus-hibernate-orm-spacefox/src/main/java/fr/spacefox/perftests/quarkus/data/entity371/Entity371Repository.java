package fr.spacefox.perftests.quarkus.data.entity371;

import fr.spacefox.perftests.quarkus.core.port.data.Entity371DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service371.model.Model371;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity371Repository implements Entity371DatasourcePort, PanacheRepository<Entity371> {
    @Override
    public Optional<Model371> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
