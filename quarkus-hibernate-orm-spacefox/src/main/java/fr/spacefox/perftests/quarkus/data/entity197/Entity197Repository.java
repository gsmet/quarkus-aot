package fr.spacefox.perftests.quarkus.data.entity197;

import fr.spacefox.perftests.quarkus.core.port.data.Entity197DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service197.model.Model197;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity197Repository implements Entity197DatasourcePort, PanacheRepository<Entity197> {
    @Override
    public Optional<Model197> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
