package fr.spacefox.perftests.quarkus.core.service186;

import fr.spacefox.perftests.quarkus.core.port.data.Entity186DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service186.model.Model186;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service186 {

    private final Entity186DatasourcePort datasource;

    public Service186(Entity186DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model186 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
