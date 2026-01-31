package fr.spacefox.perftests.quarkus.data.entity448;

import fr.spacefox.perftests.quarkus.core.port.data.Entity448DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service448.model.Model448;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity448Repository implements Entity448DatasourcePort, PanacheRepository<Entity448> {
    @Override
    public Optional<Model448> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
