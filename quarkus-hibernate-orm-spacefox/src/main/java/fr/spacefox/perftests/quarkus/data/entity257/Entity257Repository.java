package fr.spacefox.perftests.quarkus.data.entity257;

import fr.spacefox.perftests.quarkus.core.port.data.Entity257DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service257.model.Model257;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity257Repository implements Entity257DatasourcePort, PanacheRepository<Entity257> {
    @Override
    public Optional<Model257> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
