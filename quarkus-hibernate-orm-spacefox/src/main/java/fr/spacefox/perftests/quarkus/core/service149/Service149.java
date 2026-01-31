package fr.spacefox.perftests.quarkus.core.service149;

import fr.spacefox.perftests.quarkus.core.port.data.Entity149DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service149.model.Model149;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service149 {

    private final Entity149DatasourcePort datasource;

    public Service149(Entity149DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model149 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
