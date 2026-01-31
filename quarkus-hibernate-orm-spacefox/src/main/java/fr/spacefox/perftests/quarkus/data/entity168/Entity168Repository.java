package fr.spacefox.perftests.quarkus.data.entity168;

import fr.spacefox.perftests.quarkus.core.port.data.Entity168DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service168.model.Model168;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity168Repository implements Entity168DatasourcePort, PanacheRepository<Entity168> {
    @Override
    public Optional<Model168> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
