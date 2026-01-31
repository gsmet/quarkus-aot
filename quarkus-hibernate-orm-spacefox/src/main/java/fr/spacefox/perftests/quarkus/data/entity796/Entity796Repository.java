package fr.spacefox.perftests.quarkus.data.entity796;

import fr.spacefox.perftests.quarkus.core.port.data.Entity796DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service796.model.Model796;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity796Repository implements Entity796DatasourcePort, PanacheRepository<Entity796> {
    @Override
    public Optional<Model796> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
