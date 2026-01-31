package fr.spacefox.perftests.quarkus.data.entity217;

import fr.spacefox.perftests.quarkus.core.port.data.Entity217DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service217.model.Model217;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity217Repository implements Entity217DatasourcePort, PanacheRepository<Entity217> {
    @Override
    public Optional<Model217> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
