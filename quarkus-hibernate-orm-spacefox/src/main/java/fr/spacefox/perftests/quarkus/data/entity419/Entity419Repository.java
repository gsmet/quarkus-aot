package fr.spacefox.perftests.quarkus.data.entity419;

import fr.spacefox.perftests.quarkus.core.port.data.Entity419DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service419.model.Model419;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity419Repository implements Entity419DatasourcePort, PanacheRepository<Entity419> {
    @Override
    public Optional<Model419> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
