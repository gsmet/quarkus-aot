package fr.spacefox.perftests.quarkus.data.entity572;

import fr.spacefox.perftests.quarkus.core.port.data.Entity572DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service572.model.Model572;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity572Repository implements Entity572DatasourcePort, PanacheRepository<Entity572> {
    @Override
    public Optional<Model572> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
