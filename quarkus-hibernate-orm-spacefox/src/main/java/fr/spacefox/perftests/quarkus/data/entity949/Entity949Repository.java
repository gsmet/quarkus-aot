package fr.spacefox.perftests.quarkus.data.entity949;

import fr.spacefox.perftests.quarkus.core.port.data.Entity949DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service949.model.Model949;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity949Repository implements Entity949DatasourcePort, PanacheRepository<Entity949> {
    @Override
    public Optional<Model949> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
