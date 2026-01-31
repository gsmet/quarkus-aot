package fr.spacefox.perftests.quarkus.data.entity767;

import fr.spacefox.perftests.quarkus.core.port.data.Entity767DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service767.model.Model767;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity767Repository implements Entity767DatasourcePort, PanacheRepository<Entity767> {
    @Override
    public Optional<Model767> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
