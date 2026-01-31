package fr.spacefox.perftests.quarkus.core.service404;

import fr.spacefox.perftests.quarkus.core.port.data.Entity404DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service404.model.Model404;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service404 {

    private final Entity404DatasourcePort datasource;

    public Service404(Entity404DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model404 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
