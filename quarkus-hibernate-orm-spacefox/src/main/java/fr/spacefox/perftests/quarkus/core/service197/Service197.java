package fr.spacefox.perftests.quarkus.core.service197;

import fr.spacefox.perftests.quarkus.core.port.data.Entity197DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service197.model.Model197;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service197 {

    private final Entity197DatasourcePort datasource;

    public Service197(Entity197DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model197 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
