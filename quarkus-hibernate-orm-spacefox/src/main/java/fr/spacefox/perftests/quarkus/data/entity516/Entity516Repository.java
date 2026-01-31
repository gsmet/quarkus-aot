package fr.spacefox.perftests.quarkus.data.entity516;

import fr.spacefox.perftests.quarkus.core.port.data.Entity516DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service516.model.Model516;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity516Repository implements Entity516DatasourcePort, PanacheRepository<Entity516> {
    @Override
    public Optional<Model516> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
