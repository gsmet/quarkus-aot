package fr.spacefox.perftests.quarkus.data.entity150;

import fr.spacefox.perftests.quarkus.core.port.data.Entity150DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service150.model.Model150;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity150Repository implements Entity150DatasourcePort, PanacheRepository<Entity150> {
    @Override
    public Optional<Model150> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
