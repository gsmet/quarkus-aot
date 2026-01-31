package fr.spacefox.perftests.quarkus.data.entity346;

import fr.spacefox.perftests.quarkus.core.port.data.Entity346DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service346.model.Model346;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity346Repository implements Entity346DatasourcePort, PanacheRepository<Entity346> {
    @Override
    public Optional<Model346> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
