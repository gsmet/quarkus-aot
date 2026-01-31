package fr.spacefox.perftests.quarkus.data.entity878;

import fr.spacefox.perftests.quarkus.core.port.data.Entity878DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service878.model.Model878;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity878Repository implements Entity878DatasourcePort, PanacheRepository<Entity878> {
    @Override
    public Optional<Model878> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
