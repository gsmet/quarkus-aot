package fr.spacefox.perftests.quarkus.data.entity421;

import fr.spacefox.perftests.quarkus.core.port.data.Entity421DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service421.model.Model421;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity421Repository implements Entity421DatasourcePort, PanacheRepository<Entity421> {
    @Override
    public Optional<Model421> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
