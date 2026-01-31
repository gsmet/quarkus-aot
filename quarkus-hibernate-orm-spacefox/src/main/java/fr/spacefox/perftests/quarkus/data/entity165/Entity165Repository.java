package fr.spacefox.perftests.quarkus.data.entity165;

import fr.spacefox.perftests.quarkus.core.port.data.Entity165DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service165.model.Model165;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity165Repository implements Entity165DatasourcePort, PanacheRepository<Entity165> {
    @Override
    public Optional<Model165> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
