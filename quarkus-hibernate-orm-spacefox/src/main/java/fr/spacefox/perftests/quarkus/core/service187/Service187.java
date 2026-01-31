package fr.spacefox.perftests.quarkus.core.service187;

import fr.spacefox.perftests.quarkus.core.port.data.Entity187DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service187.model.Model187;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service187 {

    private final Entity187DatasourcePort datasource;

    public Service187(Entity187DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model187 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
