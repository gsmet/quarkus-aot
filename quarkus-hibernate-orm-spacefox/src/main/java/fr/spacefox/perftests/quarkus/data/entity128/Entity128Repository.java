package fr.spacefox.perftests.quarkus.data.entity128;

import fr.spacefox.perftests.quarkus.core.port.data.Entity128DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service128.model.Model128;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity128Repository implements Entity128DatasourcePort, PanacheRepository<Entity128> {
    @Override
    public Optional<Model128> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
